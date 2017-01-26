package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_209 {
    private final Production34_209 production = new Production34_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}