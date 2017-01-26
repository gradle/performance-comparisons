package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_234 {
    private final Production29_234 production = new Production29_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}