package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_167 {
    private final Production74_167 production = new Production74_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}