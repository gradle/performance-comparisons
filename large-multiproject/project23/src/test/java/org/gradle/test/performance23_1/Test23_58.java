package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_58 {
    private final Production23_58 production = new Production23_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}