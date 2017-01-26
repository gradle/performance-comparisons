package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_14 {
    private final Production23_14 production = new Production23_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}