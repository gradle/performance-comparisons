package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_202 {
    private final Production11_202 production = new Production11_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}