package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_358 {
    private final Production11_358 production = new Production11_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}