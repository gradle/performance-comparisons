package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_72 {
    private final Production23_72 production = new Production23_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}