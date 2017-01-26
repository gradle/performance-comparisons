package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_45 {
    private final Production11_45 production = new Production11_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}