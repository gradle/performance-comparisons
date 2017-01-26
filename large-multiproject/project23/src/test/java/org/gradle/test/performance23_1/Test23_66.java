package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_66 {
    private final Production23_66 production = new Production23_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}