package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_126 {
    private final Production11_126 production = new Production11_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}