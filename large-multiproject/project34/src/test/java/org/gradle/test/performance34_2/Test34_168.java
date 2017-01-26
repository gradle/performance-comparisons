package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_168 {
    private final Production34_168 production = new Production34_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}