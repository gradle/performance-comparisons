package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_325 {
    private final Production11_325 production = new Production11_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}