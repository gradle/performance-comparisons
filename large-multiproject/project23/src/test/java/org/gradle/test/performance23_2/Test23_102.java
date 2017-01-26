package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_102 {
    private final Production23_102 production = new Production23_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}