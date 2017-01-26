package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_58 {
    private final Production11_58 production = new Production11_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}