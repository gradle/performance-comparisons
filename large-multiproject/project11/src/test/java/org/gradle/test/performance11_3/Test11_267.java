package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_267 {
    private final Production11_267 production = new Production11_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}