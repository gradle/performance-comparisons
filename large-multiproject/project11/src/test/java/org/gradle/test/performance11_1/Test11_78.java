package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_78 {
    private final Production11_78 production = new Production11_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}