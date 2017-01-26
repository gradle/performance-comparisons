package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_89 {
    private final Production23_89 production = new Production23_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}