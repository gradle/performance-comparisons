package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_71 {
    private final Production11_71 production = new Production11_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}