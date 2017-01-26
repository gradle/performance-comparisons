package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_500 {
    private final Production23_500 production = new Production23_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}