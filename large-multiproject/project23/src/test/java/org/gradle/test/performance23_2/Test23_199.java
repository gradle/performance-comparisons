package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_199 {
    private final Production23_199 production = new Production23_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}