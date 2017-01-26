package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_71 {
    private final Production34_71 production = new Production34_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}