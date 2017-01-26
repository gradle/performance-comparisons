package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_89 {
    private final Production34_89 production = new Production34_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}