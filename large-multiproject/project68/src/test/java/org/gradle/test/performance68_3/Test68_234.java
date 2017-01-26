package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_234 {
    private final Production68_234 production = new Production68_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}