package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_294 {
    private final Production11_294 production = new Production11_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}