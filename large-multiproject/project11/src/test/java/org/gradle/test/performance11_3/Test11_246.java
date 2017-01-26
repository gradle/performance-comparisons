package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_246 {
    private final Production11_246 production = new Production11_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}