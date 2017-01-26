package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_66 {
    private final Production11_66 production = new Production11_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}