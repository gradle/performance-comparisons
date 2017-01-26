package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_259 {
    private final Production23_259 production = new Production23_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}