package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_75 {
    private final Production11_75 production = new Production11_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}