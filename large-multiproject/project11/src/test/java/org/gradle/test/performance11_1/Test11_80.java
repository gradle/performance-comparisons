package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_80 {
    private final Production11_80 production = new Production11_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}