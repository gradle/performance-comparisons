package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_157 {
    private final Production11_157 production = new Production11_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}