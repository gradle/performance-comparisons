package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_167 {
    private final Production23_167 production = new Production23_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}