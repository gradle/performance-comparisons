package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_147 {
    private final Production34_147 production = new Production34_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}