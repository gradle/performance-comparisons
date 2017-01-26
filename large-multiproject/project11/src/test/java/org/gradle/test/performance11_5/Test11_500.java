package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_500 {
    private final Production11_500 production = new Production11_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}