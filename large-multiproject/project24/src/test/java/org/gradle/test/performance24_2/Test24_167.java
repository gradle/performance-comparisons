package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_167 {
    private final Production24_167 production = new Production24_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}