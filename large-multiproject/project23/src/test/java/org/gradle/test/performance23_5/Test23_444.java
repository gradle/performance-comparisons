package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_444 {
    private final Production23_444 production = new Production23_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}