package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_167 {
    private final Production11_167 production = new Production11_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}