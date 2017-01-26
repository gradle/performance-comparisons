package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_281 {
    private final Production34_281 production = new Production34_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}