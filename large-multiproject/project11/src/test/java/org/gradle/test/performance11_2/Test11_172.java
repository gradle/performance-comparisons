package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_172 {
    private final Production11_172 production = new Production11_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}