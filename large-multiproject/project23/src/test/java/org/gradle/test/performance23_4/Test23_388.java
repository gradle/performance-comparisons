package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_388 {
    private final Production23_388 production = new Production23_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}