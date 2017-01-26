package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_367 {
    private final Production23_367 production = new Production23_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}