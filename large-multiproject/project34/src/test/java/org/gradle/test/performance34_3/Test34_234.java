package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_234 {
    private final Production34_234 production = new Production34_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}