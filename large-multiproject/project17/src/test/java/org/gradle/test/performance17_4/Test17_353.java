package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_353 {
    private final Production17_353 production = new Production17_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}