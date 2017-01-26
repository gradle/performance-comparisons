package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_39 {
    private final Production23_39 production = new Production23_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}