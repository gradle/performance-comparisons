package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_195 {
    private final Production11_195 production = new Production11_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}