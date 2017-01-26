package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_167 {
    private final Production79_167 production = new Production79_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}