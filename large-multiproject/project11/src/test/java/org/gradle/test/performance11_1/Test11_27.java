package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_27 {
    private final Production11_27 production = new Production11_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}