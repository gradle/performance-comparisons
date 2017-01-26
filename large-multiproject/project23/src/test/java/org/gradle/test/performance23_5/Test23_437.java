package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_437 {
    private final Production23_437 production = new Production23_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}