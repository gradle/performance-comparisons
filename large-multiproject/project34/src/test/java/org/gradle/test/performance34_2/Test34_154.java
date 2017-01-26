package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_154 {
    private final Production34_154 production = new Production34_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}