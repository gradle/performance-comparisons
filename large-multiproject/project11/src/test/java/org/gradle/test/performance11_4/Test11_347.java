package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_347 {
    private final Production11_347 production = new Production11_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}