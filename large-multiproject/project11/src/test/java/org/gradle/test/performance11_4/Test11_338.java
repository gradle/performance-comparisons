package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_338 {
    private final Production11_338 production = new Production11_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}