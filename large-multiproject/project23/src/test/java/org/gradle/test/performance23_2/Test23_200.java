package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_200 {
    private final Production23_200 production = new Production23_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}