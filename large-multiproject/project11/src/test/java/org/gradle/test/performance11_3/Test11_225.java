package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_225 {
    private final Production11_225 production = new Production11_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}