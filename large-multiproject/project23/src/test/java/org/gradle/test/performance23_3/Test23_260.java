package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_260 {
    private final Production23_260 production = new Production23_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}