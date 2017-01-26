package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_73 {
    private final Production11_73 production = new Production11_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}