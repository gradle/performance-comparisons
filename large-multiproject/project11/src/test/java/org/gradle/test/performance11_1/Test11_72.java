package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_72 {
    private final Production11_72 production = new Production11_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}