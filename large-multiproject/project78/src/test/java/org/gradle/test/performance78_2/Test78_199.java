package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_199 {
    private final Production78_199 production = new Production78_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}