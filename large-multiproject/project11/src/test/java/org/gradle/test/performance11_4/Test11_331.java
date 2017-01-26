package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_331 {
    private final Production11_331 production = new Production11_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}